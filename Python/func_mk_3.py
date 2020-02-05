
def func_a(a, b=10, c=100):
    print(a+b+c)

func_a(10,20,30)
func_a(a=10, b=100, c=200)
func_a(c=10, a=100, b=200)
func_a(100, c=300)