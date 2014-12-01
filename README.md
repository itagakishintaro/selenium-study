# 注意事項

基本を説明するため、PageObjectなどを用いない書き方にしています。
良いテストコードではないので、注意してください。

# 構成
* src/test/groovy: Geb+Spockのテストコードの例
* src/test/java: Selenium+JUnitのテストコードの例

# 環境準備

* FireFox
* JDK
* IntelliJ IDEA 14
* Groovy
* Gradle

# インストール方法

参考：https://github.com/kyonmm/stac2014-handson-document

## FireFox

入手元URL:https://www.mozilla.org/ja/firefox/new/
インストール,確認例:https://support.mozilla.org/ja/kb/how-download-and-install-firefox-windows

## JDK8

入手元URL:http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
インストール,確認例:http://nanananande.helpfulness.jp/post-2897/

## IntelliJ IDEA 14

入手元URL:https://www.jetbrains.com/idea/download/
MacでJDK7以上を使って動作させる設定:http://blog.yotchang4s.org/2014/04/13/mac_java8_intellij_idea_13_1_1
設定例:http://kyon-mm.bitbucket.org/blog/html/2013/12/01/intellij_setting.html

## GVM

入手元URL:http://gvmtool.net/
Mac/Linux/Cygwinでのインストールはコンソールでcurl -s get.gvmtool.net | bashとします。
コンソールでgvm vとしてバージョンが表示されたら大丈夫です。
Windowsの方はposh-gvmを利用できます。
入手元URL:https://github.com/flofreud/posh-gvm
インストール,確認例:http://qiita.com/_y_u_/items/7a4ffd6b79c829c9962f

## Groovy

コンソールでgvm i groovyでインストールします。
コンソールでgroovy -vとしてバージョンが表示されたら大丈夫です。

## Gradle

コンソールでgvm i gradleでインストールします。
コンソールでgradle -vとしてバージョンが表示されたら大丈夫です。