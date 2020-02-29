# String problem - LAPIN
# Link - https://www.codechef.com/problems/LAPIN
# @akarshsingh9

import sys
import collections

t = int(sys.stdin.readline())
l = []
compare = lambda x, y: collections.Counter(x) == collections.Counter(y)
for i in range(t):
    s = input()
    n = len(s)
    if n % 2 != 0:
        mid = int(n/2)
        s1 = s[0:mid]
        s2 = s[mid+1:]
        l1 = list(s1)
        l2 = list(s2)
        if compare(l1,l2):
            l.append(1)
        else:
            l.append(0)
    else:
        mid = int(n/2)
        s1 = s[0:mid]
        s2 = s[mid:]
        l1 = list(s1)
        l2 = list(s2)
        if compare(l1,l2):
            l.append(1)
        else:
            l.append(0)

for i in l:
    if i == 1:
        print('YES')
    else:
        print('NO')                            