//prime or not updated


num=int(input("Enter the number :"))
for i in range(2,num):
    if(num%i==0):
        prime=False
        break
    else:
        prime=True
if(prime==False):
    print(num,'is not prime')
else:
    print(num,'is prime')