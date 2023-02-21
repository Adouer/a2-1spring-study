package com.adouer;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author adouer
 */
public class MyApplicationContext {
    /**
     * 存放Bean的Map
     */
    private Map<String, Object> beanMap = new HashMap<String, Object>();


    public MyApplicationContext(String xmlPath) {
        try {
            // 获取解析器
            SAXReader reader = new SAXReader();
            // 读取xml,得到document
            Document document = reader.read(new File(xmlPath));
            // document获取根节点<beans>
            Element rootElement = document.getRootElement();
            // 得到根节点下的所有<bean>节点集合
            List<Element> beans = rootElement.elements();
            /*
                遍历获取属性,这里省略了属性设置赋值的部分
             */
            for (Element bean : beans) {
                // 获取id属性
                Attribute attrId = bean.attribute("id");
                // 获取class属性
                Attribute attrClass = bean.attribute("class");
                // 获取id值
                String idValue = attrId.getValue();
                // 获取class的值
                String classValue = attrClass.getValue();
                // 反射
                Object beanObj = Class.forName(classValue).newInstance();
                beanMap.put(idValue, beanObj);
            }
        } catch (Exception e) {
            System.out.println("解析xml过程异常");
            e.printStackTrace();
        }
    }


    /**
     * 返回实例bean
     *
     * @param id
     * @return
     */
    public Object getBean(String id) {
        return this.beanMap.get(id);
    }

}
