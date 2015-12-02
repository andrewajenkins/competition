#!/bin/bash
echo 'running...'
javac -cp "." AlternativeThinking.java
java -cp "." AlternativeThinking AlternativeThinking.data
rm *.class 2>/dev/null
echo 'fin'
