from django.shortcuts import render

# Create your views here.
def indexView(request):
    print("hello word")

    return render(request, 'index.html')
