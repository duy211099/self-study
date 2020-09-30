from django.http import HttpResponse
from django.shortcuts import render

# URL - Uniform Resource Locator (Address)


def index(request):
    return HttpResponse('Hello World!')


def new(request):
    return HttpResponse('New product')