# Island World

> Overworld is 80% ocean and 20% scattered islands. Vanilla ores compress into the islands. Oceanic structures (monuments, shipwrecks) keep their normal placement and become more visible. Boat / ship mods strongly recommended.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![NeoForge 1.21.1](https://img.shields.io/badge/NeoForge-1.21.1-orange.svg)](https://neoforged.net)
[![Depends on Isekai API](https://img.shields.io/badge/Depends-Isekai%20API-9333ea)](https://github.com/KURONAMI333/isekai-api)

---

## Concept

A scattered archipelago: hundreds of small-to-medium islands, separated by stretches of open sea. Mining and farming happen on the islands; travel and exploration happen across the water. Monuments and shipwrecks become landmarks instead of side content.

Pairs naturally with boat / ship mods (Small Ships, Boats & Bonfires) and fishing mods (Aquaculture 2). Without them, traversal can feel slow by design.

## How it works

Island World is built on **[Isekai API](https://github.com/KURONAMI333/isekai-api)**, a neutral universal worldgen library.

The library has no concept of "archipelago" — Island World composes `step`, `mask_y_range`, and rule-adaptation primitives that Isekai API offers, into a scattered-island worldshape.

## Status

**v0.1**: skeleton. `WorldshapeDescriptor` declaration + density composition land with Isekai API v0.2.

## Dependencies

- NeoForge 1.21.1
- [Isekai API](https://github.com/KURONAMI333/isekai-api) (required)

## License

[MIT License](LICENSE) — modpack inclusion welcome, no credit required.

## Credits

- Author: KURONAMI
