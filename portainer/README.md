
| <img src="https://github.com/lmagyar/homeassistant-addon-portainer-beta/raw/main/images/stop_sign.png" title="Stop"> | This is a beta repository! Please use the non-beta https://github.com/lmagyar/homeassistant-addon-portainer repository! This beta repository is for myself to experiment and test. After it works I delete even the images from docker. | <img src="https://github.com/lmagyar/homeassistant-addon-portainer-beta/raw/main/images/stop_sign.png" title="Stop"> |
| --- | --- | --- |

# Home Assistant Custom Add-on: Portainer

![Warning][warning_stripe]

> This is a **fork** of the deprecated [community add-on][community_addon]!
>
> This makes it available again.

![Warning][warning_stripe]

Manage your Docker environment with ease.

[![GitHub Release][releases-shield]][releases]
[![Last Updated][updated-shield]][updated]
![Reported Installations][installations-shield]
![Project Stage][project-stage-shield]
[![License][license-shield]][licence]

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]
![Supports armhf Architecture][armhf-shield]
![Supports armv7 Architecture][armv7-shield]
![Supports i386 Architecture][i386-shield]

[![Github Actions][github-actions-shield]][github-actions]
![Project Maintenance][maintenance-shield]
[![GitHub Activity][commits-shield]][commits]

![The Portainer Add-on][screenshot]

## About

Portainer is an open-source lightweight management UI which allows you to
easily manage a Docker host(s) or Docker swarm clusters.

It has never been so easy to manage Docker. Portainer provides a detailed
overview of Docker and allows you to manage containers, images, networks and
volumes.

## WARNING 1

The Portainer add-on is really powerful and gives you access to virtually
your whole system. While this add-on is created and maintained with care and
with security in mind, in the wrong or inexperienced hands,
it could damage your system.

## WARNING 2

The Portainer add-on is meant for debugging Home Assistant and its containers.
It has not meant or designed for managing or deploying your custom software
or third-party containers.

**Home Assistant DOES NOT SUPPORT running third party containers**
on Home Assistant OS or Supervised installation types. Ignoring this, will
render your system as unsupported!

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[commits-shield]: https://img.shields.io/github/commit-activity/y/lmagyar/homeassistant-addon-portainer.svg
[commits]: https://github.com/lmagyar/homeassistant-addon-portainer/commits/main
[github-actions-shield]: https://github.com/lmagyar/homeassistant-addon-portainer/workflows/Publish/badge.svg
[github-actions]: https://github.com/lmagyar/homeassistant-addon-portainer/actions
[i386-shield]: https://img.shields.io/badge/i386-no-red.svg
[installations-shield]: https://img.shields.io/badge/dynamic/json?label=reported%20installations&query=$[%278be344cf_portainer%27].total&url=https%3A%2F%2Fanalytics.home-assistant.io%2Faddons.json
[license-shield]: https://img.shields.io/github/license/lmagyar/homeassistant-addon-portainer.svg
[licence]: https://github.com/lmagyar/homeassistant-addon-portainer/blob/main/LICENSE
[maintenance-shield]: https://img.shields.io/maintenance/yes/2023.svg
[project-stage-shield]: https://img.shields.io/badge/project%20stage-production%20ready-green.svg
[releases-shield]: https://img.shields.io/github/tag/lmagyar/homeassistant-addon-portainer.svg?label=release
[releases]: https://github.com/lmagyar/homeassistant-addon-portainer/tags
[screenshot]: https://github.com/lmagyar/homeassistant-addon-portainer/raw/main/images/screenshot.png
[updated-shield]: https://img.shields.io/github/last-commit/lmagyar/homeassistant-addon-portainer/main?label=updated
[updated]: https://github.com/lmagyar/homeassistant-addon-portainer/commits/main
[warning_stripe]: https://github.com/lmagyar/homeassistant-addon-portainer/raw/main/images/warning_stripe_wide.png
[community_addon]: https://github.com/hassio-addons/addon-portainer
