for i in range(11):
    print('*'*i)
    
#Output:

# *
# **
# ***
# ****
# *****
# ******
# *******
# ********
# *********
# **********

print('\n'*3)
print('_'*25)
print('\n'*3)

for i in reversed(range(11)):
    print('*'*i)

#Output:

# **********
# *********
# ********
# *******
# ******
# *****
# ****
# ***
# **
# *

print('\n'*3)
print('_'*25)
print('\n'*3)

for i,k in zip(reversed(range(12)), range(11)):
    print(' '*(i-1)+'*'*k)

#Output:

#          *
#         **
#        ***
#       ****
#      *****
#     ******
#    *******
#   ********
#  *********
# **********

print('\n'*3)
print('_'*25)
print('\n'*3)

for i,k in zip(range(11), reversed(range(11))):
    print(' '*(i)+'*'*k)

#Output:

# **********
#  *********
#   ********
#    *******
#     ******
#      *****
#       ****
#        ***
#         **
#          *