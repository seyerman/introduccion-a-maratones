#codeforces.com
#https://codeforces.com/problemset/problem/1030/A
n = int(input())
answers = list(map(int,input().split()))
easy = True
for ans in answers:
    if ans == 1:
        easy = False
if(easy):
    print("EASY")
else:
    print("HARD")
