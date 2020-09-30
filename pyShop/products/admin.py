from django.contrib import admin
from .models import Product
# Register your models here.
# py manage.py createsuperuser

class ProductAdmin(admin.ModelAdmin):
    list_display = ('name', 'stock', 'price')


admin.site.register(Product, ProductAdmin)
