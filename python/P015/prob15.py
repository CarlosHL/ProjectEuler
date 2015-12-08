
matrix = []

for i in range(0,20):
    matrix.append([0, 0, 0, 0, 0,
                   0, 0, 0, 0, 0,
                   0, 0, 0, 0, 0,
                   0, 0, 0, 0, 0
                  ])

matrix[19][19] = 2

n = 18
while n>-1:
    matrix[19][n] = matrix[19][n+1] + 1
    matrix[n][19] = matrix[n+1][19] + 1
    n = n - 1
    
col = 18 
while col > -1:
    fil = 18
    while fil>-1:
         matrix[fil][col] = matrix[fil+1][col] + matrix[fil][col+1]
         fil = fil-1
    col = col - 1

print matrix