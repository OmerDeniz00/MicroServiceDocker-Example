FROM mongo:latest

ENV MONGO_INITDB_ROOT_USERNAME=admin
ENV MONGO_INITDB_ROOT_PASSWORD=root
ENV MONGO_INITDB_DATABASE=UserProfileDB

EXPOSE 27017


FROM postgres:latest

ENV POSTGRES_USER=postgre
ENV POSTGRES_PASSWORD=root
ENV POSTGRES_DB=AuthDB

# Eğer ekstra SQL dosyalarıyla veritabanını başlatmak istiyorsanız:
# COPY init.sql /docker-entrypoint-initdb.d/

EXPOSE 5432
