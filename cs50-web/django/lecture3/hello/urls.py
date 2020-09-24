from django.urls import path

from . import views

urlpatterns=[
    path("", views.index, name="index"),
    path("brian", views.brian, name="brian"),
    path("duy", views.duy, name="duy"),
    path("<str:name>", views.greet, name="greet")
]

