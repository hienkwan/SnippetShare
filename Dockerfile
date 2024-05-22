FROM postgres:latest

# Environment variables
ENV POSTGRES_USER=admin
ENV POSTGRES_PASSWORD=test123
ENV POSTGRES_DB=snippetDB

# Copy any initialization scripts if needed
COPY init.sql /docker-entrypoint-initdb.d/

EXPOSE 5432