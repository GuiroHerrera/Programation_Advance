def pretty_print_ist(input_list:list)->str:
    def format_output(index,item):
        return f"{i+1} -> {item}"

    for i,item in enumerate(input_list):
        print(format_output(i,item)) #f es format y dentro son los strings para concatenar



#pretty_print_ist([1,2,3,4,5,6])
#a,b,c = 1,2,3
#print(a,b,c)
pretty_print_ist(['Uno','Dos','Tres'])