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

## License

Copyright © 2015-2019 Matthew Adereth, Tom Short, Leo Lou and Quentin Lebastard

The source code for generating the models is distributed under the [GNU AFFERO GENERAL PUBLIC LICENSE Version 3](LICENSE).

## Build log

Check out original [build log from bstiq](https://github.com/bstiq/dactyl-manuform-mini-keyboard#build-log)
