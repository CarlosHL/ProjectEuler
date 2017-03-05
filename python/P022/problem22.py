
text_file = open("p022_names.txt", "r")
l = sorted(text_file.read().split(','))

def sum_words(word):
  l = list(word)
  sum = 0
  for i in l:
    sum = sum + ord(i) - 64
  return sum
    
    

sum = 0 
for i in range(0, len(l)):
  sum = sum + (i+1)*sum_words(l[i].replace('"',''))

print sum

  
  
  
    