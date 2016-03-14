

def convert_to_string(number):
  """Converts number to list of digits"""
  n = str(number)
  list = []
  for digit in n:
    list.append(int(digit))
  return list

def calculate_sum_of_square_of_digits(list):
  """Calculate the sum of the square of the digits"""
  sum = 0
  for n in list:
    sum = sum + n*n
  return sum



""" 
x= 2
while x is not 1 and x is not 89:
  x =   convert_to_string(x)
  x = calculate_sum_of_square_of_digits(x)
  print x
  
"""

    
    
list1 = [1]
list89 = [89]
counter = 0
x= 1

while x < 10000000:
  list = convert_to_string(x)
  y = calculate_sum_of_square_of_digits(list)
  while y not in list1 and y not in list89:
    y = convert_to_string(y)
    y = calculate_sum_of_square_of_digits(y)
  if y in list1:
    if x < 567:
      list1.append(x)
  else:
    counter = counter + 1
    if x < 567:
      list89.append(x)
  x = x + 1  

print counter











  
  