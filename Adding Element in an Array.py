def begin(arr,value):
    return[value]+arr
def end(arr,value):
    return arr+[value]
def pos(arr,value,pos):
    return arr[:pos-1] + [value] + arr[pos-1:]
    
arr=[1, 2, 3, 4, 5]
arr=begin(arr,6)
arr=end(arr,7)
arr=pos(arr,8,4)

print(",".join(map(str,arr)))
