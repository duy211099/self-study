1. manage.py: This is a command-line utility used to interact with your project.
It is a thin wrapper around the django-admin.py tool. You don't need to edit
this file.
1. mysite/: This is your project directory, which consists of the following files:
	1. __init__.py: An empty file that tells Python to treat the mysite
directory as a Python module.
	1. asgi.py: This is the configuration to run your project as ASGI,
the emerging Python standard for asynchronous web servers and
applications.
	1. settings.py: This indicates settings and configuration for your
project and contains initial default settings.
	1. urls.py: This is the place where your URL patterns live. Each URL
defined here is mapped to a view.
	1.  wsgi.py: This is the configuration to run your project as a Web
Server Gateway Interface (WSGI) application.

py manage.py runserver
py manage.py migrate

# Project settings
https://docs.djangoproject.com/en/3.0/ref/settings/

The following settings are worth looking at:
1. DEBUG
1. ALLOWED_HOSTS
1. INSTALLED_APPS
1. MIDDLEWARE
1. ROOT_URLCONF
1. DATABASES

# Projects and applications