# Sudo Feedme

### A craftbukkit plugin to prevent starvation

This plugin prevents the player's food amount from falling below 3.5 food pieces.

This is the lowest level at which the player is still able to run. This plugin's 
intended effect is to prevent starvation and not being able to run while still
allowing food to be useful for healing.

It was last tested with 1.5.1, but it is likely that it will not break anytime soon.

### Compiling

    wget http://dl.bukkit.org/downloads/bukkit/get/latest-dev/bukkit.jar -O Bukkit.jar
    ant

The compiled plugin will be in `dist/SudoFeedme.jar` and can be moved to your servers `plugins` folder.

There are no configuration options.
