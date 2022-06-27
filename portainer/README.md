
| <img src="https://github.com/lmagyar/homeassistant-addon-portainer-beta/raw/main/images/stop_sign.png" title="Stop"> | This is a beta repository! Please use the non-beta https://github.com/lmagyar/homeassistant-addon-portainer repository! This beta repository is for myself to experiment and test. After it works I delete even the images from docker. | <img src="https://github.com/lmagyar/homeassistant-addon-portainer-beta/raw/main/images/stop_sign.png" title="Stop"> |
| --- | --- | --- |

# Home Assistant ~Community~ Custom Add-on: Portainer

![Warning][warning_stripe]

> This is a **fork** of the DEPRECATED [community add-on][community_addon]! This makes it available again.

![Warning][warning_stripe]

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

[![Discord][discord-shield]][discord]
[![Community Forum][forum-shield]][forum]

[![Sponsor Frenck via GitHub Sponsors][github-sponsors-shield]][github-sponsors]

[![Support Frenck on Patreon][patreon-shield]][patreon]

Manage your Docker environment with ease.

![The Portainer Hass.io add-on][screenshot]

## About

Portainer is an open-source lightweight management UI which allows you to
easily manage a Docker host(s) or Docker swarm clusters.

It has never been so easy to manage Docker. Portainer provides a detailed
overview of Docker and allows you to manage containers, images, networks and
volumes.

## ~DISCONTINUED~

~This add-on is no longer available.~

It has been used quite a lot for unsupported purposes, causing many issues,
support questions and other problems.

If you run Home Assistant, please be aware that running additional containers
is not a supported use-case and will trigger your system to be flagged
as unsupported as well.

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

## Support

Got questions?

You have several options to get them answered:

- The [Home Assistant Community Add-ons Discord chat server][discord] for add-on
  support and feature requests.
- The [Home Assistant Discord chat server][discord-ha] for general Home
  Assistant discussions and questions.
- The Home Assistant [Community Forum][forum].
- Join the [Reddit subreddit][reddit] in [/r/homeassistant][reddit]

You could also [open an issue here][issue] GitHub.

## Contributing

This is an active open-source project. We are always open to people who want to
use the code or contribute to it.

We have set up a separate document containing our
[contribution guidelines][contributing].

Thank you for being involved!

## Authors & contributors

The original setup of this repository is by [Franck Nijhof][frenck].

For a full list of all authors and contributors,
check [the contributor's page][contributors].

## We have got some Home Assistant add-ons for you

Want some more functionality to your Home Assistant instance?

We have created multiple add-ons for Home Assistant. For a full list, check out
our [GitHub Repository][repository].

## License

MIT License

Copyright (c) 2018-2021 Franck Nijhof

Copyright (c) 2022-2022 Laszlo Magyar

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[commits-shield]: https://img.shields.io/github/commit-activity/y/lmagyar/homeassistant-addon-portainer.svg
[commits]: https://github.com/lmagyar/homeassistant-addon-portainer/commits/main
[contributors]: https://github.com/lmagyar/homeassistant-addon-portainer/graphs/contributors
[contributing]: https://github.com/lmagyar/homeassistant-addon-portainer/blob/main/.github/CONTRIBUTING.md
[discord-ha]: https://discord.gg/c5DvZ4e
[discord-shield]: https://img.shields.io/discord/478094546522079232.svg
[discord]: https://discord.me/hassioaddons
[forum-shield]: https://img.shields.io/badge/community-forum-brightgreen.svg
[forum]: https://community.home-assistant.io/t/home-assistant-community-add-on-portainer/68836?u=frenck
[frenck]: https://github.com/frenck
[github-actions-shield]: https://github.com/lmagyar/homeassistant-addon-portainer/workflows/Publish/badge.svg
[github-actions]: https://github.com/lmagyar/homeassistant-addon-portainer/actions
[github-sponsors-shield]: https://frenck.dev/wp-content/uploads/2019/12/github_sponsor.png
[github-sponsors]: https://github.com/sponsors/frenck
[i386-shield]: https://img.shields.io/badge/i386-no-red.svg
[installations-shield]: https://img.shields.io/badge/dynamic/json?label=reported%20installations&query=$[%278be344cf_portainer%27].total&url=https%3A%2F%2Fanalytics.home-assistant.io%2Faddons.json
[issue]: https://github.com/lmagyar/homeassistant-addon-portainer/issues
[license-shield]: https://img.shields.io/github/license/lmagyar/homeassistant-addon-portainer.svg
[licence]: https://github.com/lmagyar/homeassistant-addon-portainer/blob/main/LICENSE
[maintenance-shield]: https://img.shields.io/maintenance/yes/2022.svg
[patreon-shield]: https://frenck.dev/wp-content/uploads/2019/12/patreon.png
[patreon]: https://www.patreon.com/frenck
[project-stage-shield]: https://img.shields.io/badge/project%20stage-custom-orange.svg
[reddit]: https://reddit.com/r/homeassistant
[releases-shield]: https://img.shields.io/github/tag/lmagyar/homeassistant-addon-portainer.svg?label=release
[releases]: https://github.com/lmagyar/homeassistant-addon-portainer/tags
[repository]: https://github.com/hassio-addons/repository
[screenshot]: https://github.com/lmagyar/homeassistant-addon-portainer/raw/main/images/screenshot.png
[updated-shield]: https://img.shields.io/github/last-commit/lmagyar/homeassistant-addon-portainer/main?label=updated
[updated]: https://github.com/lmagyar/homeassistant-addon-portainer/commits/main
[warning_stripe]: https://github.com/lmagyar/homeassistant-addon-portainer/raw/main/images/warning_stripe_wide.png
[community_addon]: https://github.com/hassio-addons/addon-portainer
