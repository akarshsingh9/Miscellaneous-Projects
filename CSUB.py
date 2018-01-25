# CSUB - string question
# Link - https://www.codechef.com/problems/CSUB
# @akarshsingh9

import sys

t = int(sys.stdin.readline())
l = []
for i in range(t):
    n = map(int,sys.stdin.readline())
    s = sys.stdin.readline()
    num = s.count('1')
    calc = int((num*(num + 1))/2)
    l.append(calc)

for i in l:
    sys.stdout.write(str(i)+'\n')    
