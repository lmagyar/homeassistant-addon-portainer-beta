# Home Assistant Custom Add-on: Portainer

![Warning][warning_stripe]

> This is a **fork** of the deprecated [community add-on][community_addon]! This makes it available again.
>
> Updates are released when Portainer releases new versions.

![Warning][warning_stripe]

## Installation

To install this add-on, you'll first need to go to your profile and turn on
"Advanced Mode", once that is done go back to Home Assistant add-ons and search
for "Portainer" and install it as you would any other add-on.

To be able to use this add-on, you'll need to disable protection mode on this
add-on. Without it, the add-on is unable to access Docker.

1. Navigate in your Home Assistant frontend to **Settings** -> **Add-ons** -> **Add-on Store**.
1. In the **...** menu at the top right corner click **Repositories**, add `https://github.com/lmagyar/homeassistant-addon-portainer` as repository.
1. Find the "Portainer" add-on and click it. If it doesn't show up, wait until HA refreshes the information about the add-on, or click **Reload** in the **...** menu at the top right corner.
1. Click on the "INSTALL" button.

## How to use

1. Under the Info tab set the "Protection mode" switch to off.
1. Start the add-on.
1. Check the add-on log output to see the result.

## Add-on Configuration

**Note**: _Remember to restart the add-on when the configuration is changed._

Example add-on configuration:

```yaml
log_level: info
agent_secret: password
```

**Note**: _This is just an example, don't copy and paste it! Create your own!_

### Option: `log_level`

The `log_level` option controls the level of log output by the addon and can
be changed to be more or less verbose, which might be useful when you are
dealing with an unknown issue. Possible values are:

- `trace`: Show every detail, like all called internal functions.
- `debug`: Shows detailed debug information.
- `info`: Normal (usually) interesting events.
- `notice`: Normal but significant events.
- `warning`: Exceptional occurrences that are not errors.
- `error`: Runtime errors that do not require immediate action.
- `fatal`: Something went terribly wrong. Add-on becomes unusable.

Please note that each level automatically includes log messages from a
more severe level, e.g., `debug` also shows `info` messages. By default,
the `log_level` is set to `info`, which is the recommended setting unless
you are troubleshooting.

### Option: `agent_secret`

An option to set a shared agent secret. Must also be set in the remote agent
as an Environment variable.

## Support

Got questions?

You have several options to get them answered:

- The [Home Assistant Discord chat server][discord].
- The Home Assistant [Community Forum][forum].
- Join the [Reddit subreddit][reddit] in [/r/homeassistant][reddit]

You could also [open an issue here][issue] GitHub.

[discord]: https://discord.gg/c5DvZ4e
[forum]: https://community.home-assistant.io/t/home-assistant-community-add-on-portainer/68836
[issue]: https://github.com/lmagyar/homeassistant-addon-portainer/issues
[reddit]: https://reddit.com/r/homeassistant
[warning_stripe]: https://github.com/lmagyar/homeassistant-addon-portainer/raw/main/images/warning_stripe_wide.png
[community_addon]: https://github.com/hassio-addons/addon-portainer
