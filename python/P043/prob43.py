# check if all the digits are unique
def check_unique(l):
  if len(l) == len(set(l)):
    return True
  else:
    return False

# get the initial list of the divisors of 17 
def initial():
  l1 = []
  for i in range(1, 1000):
    if i % 17 == 0:
      temp = str(i)
      if len(temp) < 3:
        temp = "0" + temp
      if check_unique(temp):
        l1.append(temp)
  return l1

# update the list with the divisor of num
def iterator(l, num):
  numbers = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
  l2 = []
  for i in range(0, len(l)):
    for t in range(0, len(numbers)):
      temp = numbers[t] + l[i]
      if check_unique(temp):
        digit = list(temp)[0] +  list(temp)[1] + list(temp)[2]
        if int(digit) % int(num) == 0: 
          l2.append(temp) 
  return l2
    

    
  


l = initial()
primes = ["13", "11", "7", "5", "3", "2", "1"]


for i in range(0, len(primes)):
  l = iterator(l, primes[i])
print sum(map(long, l))

