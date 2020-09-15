# Pass an argument to the function
# ================================
def the_2nd_fun(a):
    print('The number is %d' % a)

the_2nd_fun(100)

# How about passing a string?


# How to solve this issue?
def the_2nd_2_fun(a):
    if isinstance(a, int):
        print('The number is %d' % a)
    else:
        print('Could you please pass a integer?')


the_2nd_2_fun('100')
the_2nd_2_fun(100)

# The passed value will be changed by the function or not?
def the_2rd_3_fun(x):
    print('The passed argument is', x)
    x = 'Aha, I change.'
    print(x)

x = 10.0
the_2rd_3_fun(x)
print('x is ', x)

# How about passing a list to a function?
def the_2nd_4_fun(x):
    print('The passed argument is', x)
    x[0] = 10
    print('Now, x is ',x)

x = [1, 2, 3]
the_2nd_4_fun(x)
print('Finally, x is', x)

# How to pass many arguments?
def the_2nd_5_fun(x, y, z):
    print('x, y, z are', x, y, z)

a, b, c = 10, 20, 30 # Yes! This is a good way to set values # Call the function in this way:
the_2nd_5_fun(a, b, c)
# Or
the_2nd_5_fun(y=b, x=a, z=c)

# How to set a default value for a function
def the_2nd_6_fun(x, y, z=1000):
    print('x, y, z are', x, y, z)

# Call the function in this way:
the_2nd_6_fun(10, 20)

# How to use a global variable?
g = 10
def the_2nd_7_fun():
    print('The global variable is', g)
the_2nd_7_fun()



# This is the right way:
def the_2nd_9_fun():
    global g
    if g == 10:
        g = 20
    print('The global variable is', g)

the_2nd_9_fun



# Return values from function
# ============================
def the_3rd_fun(x):
    return x ** 2 # ** means power （乘方）

a = 10
r = the_3rd_fun(a)
print('The result is', r)

# How to return many values

# Method 1: using list
def the_3rd_2_fun(x):
    l = [x, x + 1, x * 2]
    return l

l = the_3rd_2_fun(10)
print(l)
# How about:
x1, x2, x3 = the_3rd_2_fun(10)
print(x1, x2, x3)
# Actually, we can use a very natural way to return values
def the_3rd_3_fun(x):
    return x, x + 1, x * 2

x1, x2, x3 = the_3rd_2_fun(10)
print(x1, x2, x3)
# If you do not need the second return value
x1, _, x3 = the_3rd_2_fun(10)
print(x1, x3)

# Uncertain number of arguments
# ==========================
# Method 1
def the_4th_fun(a, *args):
    print('a is', a)
    print('Others are', end=' ')
    for arg in args:
        print(arg, end=', ') # Feel the meaning of "end"
    print('')

the_4th_fun(10, 20)
the_4th_fun(10, 20, 30)

# Method 2
def the_4th_2_fun(**args):
    for arg in args.keys():
        print(arg,'=',args[arg], end=', ') # Feel the meaning of "end"
    print('')

the_4th_2_fun(a=1, b=2)