# Dactyl ManuForm Mini Keyboard

This is a fork of the [Dactyl-ManuForm-Mini](https://github.com/bstiq/dactyl-manuform-mini-keyboard), which is a fork of the [Dactyl-ManuForm-Mini](https://github.com/l4u/dactyl-manuform-mini-keyboard). The Dactyl-Manuform-Mini is a fork of the [Dactyl-Manuform](https://github.com/tshort/dactyl-keyboard), which is a fork of the [Dactyl](https://github.com/adereth/dactyl-keyboard) with the thumb cluster from [ManuForm](https://github.com/jeffgran/ManuForm).

## Features

Here is the list of features which have been added after the fork from the [Dactyl-ManuForm-Mini](https://github.com/bstiq/dactyl-manuform-mini-keyboard):

- added hole for reset button
- updated web thickness in order to support [amoeba king v1.3 pcb](https://github.com/climent/keyboard-pcbs/tree/king_v1.3/amoeba-king)
- added m3 rods for pcb attachment
- use five thumb keys by default
- elipse like usb jack insert hole

## Getting the case and bottom plate

### Option 1: Generate OpenSCAD and STL models

- Run `lein generate` or `lein auto generate`
- This will regenerate the `things/*.scad` files
- Use OpenSCAD to open a `.scad` file.
- Make changes to design, repeat `load-file`, OpenSCAD will watch for changes and rerender ( you need to set `add_m3_rods_for_pcb` variable to `false` in order for this to work - m3 rod models generate huge number of elements ).
- When done, use OpenSCAD to export STL files

### Option 2: Use the stl files

Print [stl files from repository](https://github.com/johnybx/dactyl-manuform-mini-keyboard/issues/1).
## Parts list
- 50x [amoeba king v1.3](https://github.com/climent/keyboard-pcbs/tree/king_v1.3/amoeba-king)
- 50x Kailh MX Hotswap Sockets  
- 50x sk6812 mini-e
- 50x Diode 1n4148 (SOD-323)
- 2× TRRS panel mount jacks 3.5mm
- 1x TRRS cable
- 2x Reset button
- wiring cable (silicone insulated cable was quite helpful)
- 50x keyswitches (cherry mx)
- lava keycaps
- rp2040 controller 2x
- solder
- ~100x M3 screws / nut inserts ( optional - nylon screws for pcb )
- 2x USB C male connector pcb
- 2x USB C female connector pcb
- 2x USB C Shell Case

## Build log

Check out original [build log from bstiq](https://github.com/bstiq/dactyl-manuform-mini-keyboard#build-log). Build is very similar except for using amoeba king v1.3 pcb but these are very well documented.

## Keyboard
![](https://user-images.githubusercontent.com/15018762/260303507-febf1bf4-5287-4eac-a500-88a7cb3e76e4.jpg)
![](https://user-images.githubusercontent.com/15018762/260303504-eb09bf7a-7104-487c-a1d0-a653117dcfe8.jpg)

More pictures of keyboard can be found [here](https://github.com/johnybx/dactyl-manuform-mini-keyboard/issues/2#issue-1848582864)

## Firmware
Source code of QMK firmware used can be found [here](https://github.com/johnybx/dactyl-manuform-mini-keymap)

## License

Copyright © 2015-2019 Matthew Adereth, Tom Short, Leo Lou and Quentin Lebastard

The source code for generating the models is distributed under the [GNU AFFERO GENERAL PUBLIC LICENSE Version 3](LICENSE).
