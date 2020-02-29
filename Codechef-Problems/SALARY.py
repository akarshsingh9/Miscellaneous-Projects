# array based question SALARY
# Link: https://www.codechef.com/problems/SALARY
# @akarshsingh9
import sys
t = int(sys.stdin.readline())
w = []
l = []
steps = 0
for i in range(t):
    n = int(input())
    num = map(int,sys.stdin.readline().rstrip().split(' '))
    w = list(num)
    steps = sum(w) - n*min(w)
    l.append(steps)

for i in l:
    sys.stdout.write(str(i)+'\n')     