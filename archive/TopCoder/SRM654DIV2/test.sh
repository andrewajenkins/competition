#!/bin/bash
echo 'running ...'
javac -cp "src;test;.;../junit/*" TestRunner.java
java -cp "src;test;.;../junit/*" TestRunner
rm src/*.class test/*.class ./*.class ../*.class 2>/dev/null
echo 'fin'
