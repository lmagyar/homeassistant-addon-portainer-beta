server {
    listen {{ .interface }}:{{ .port }} default_server;

    include /etc/nginx/includes/server_params.conf;
    include /etc/nginx/includes/proxy_params.conf;

    client_max_body_size 0;

    proxy_hide_header X-Frame-Options;
    proxy_hide_header Content-Security-Policy;
    add_header X-Frame-Options "SAMEORIGIN";
    add_header Content-Security-Policy "frame-ancestors *";

    location / {
        allow   172.30.32.2;
        deny    all;

        proxy_pass http://backend;

        # These headers must be under location section, if they moved into proxy_params.conf, even if this is valid, they won't work
        proxy_set_header Connection $connection_upgrade;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Host $http_host;
        proxy_set_header X-Forwarded-Host $http_host;
    }
}
