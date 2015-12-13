#!/bin/bash
echo 'running ...'
javac FanDuelKnapsack.java
java FanDuelKnapsack 'FanDuel-NFL-2015-12-13-13913-players-list.csv'
rm *.class 2>/dev/null
echo 'fin'
#FanDuel-NFL-2015-12-13-13913-players-list.csv
