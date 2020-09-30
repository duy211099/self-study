from django.contrib import admin
from .models import Product, Offer
# Register your models here.
# py manage.py createsuperuser


class ProductAdmin(admin.ModelAdmin):
    list_display = ('name', 'stock', 'price')


class OfferAdmin(admin.ModelAdmin):
    list_display = ('code', 'discount')


admin.site.register(Product, ProductAdmin)
admin.site.register(Offer, OfferAdmin)
