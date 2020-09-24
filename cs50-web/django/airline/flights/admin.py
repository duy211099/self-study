from django.contrib import admin
from django.db import models

from .models import Flight, Airport, Passenger

# Register your models here.
class FlightAdmin(models.Model):
    list_display=("id", "origin", "destination","duration")

class PassengerAdmin(admin.ModelAdmin):
    filter_horizontal=("flights",)

admin.site.register(Airport)
admin.site.register(Flight)
admin.site.register(Passenger, PassengerAdmin)

