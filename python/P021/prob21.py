

def divisor(num):
    list = []
    for n in range(1, num/2+1):
        if num%n == 0:
            list.append(n)
    return list
    
sumTotal = 0
for x in range (1, 10000):
    list1 = divisor(x)
    sum1 = 0
    sum2 = 0
    for y in list1:
        sum1 = sum1 + y
    if x !=sum1:
        list2 = divisor(sum1)
        for z in list2:
            sum2 = sum2 + z
        if sum2 == x:
            print x
            sumTotal = sumTotal + x 
        
print sumTotal
