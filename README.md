<div align="center">

<img src="docs/images/reciprime_logo.png" alt="ReciPrime logo" width="160">

# ReciPrime

**From Vanilla to Prime.**

[![Release](https://img.shields.io/github/v/release/zzong-mee/ReciPrime?label=release)](https://github.com/zzong-mee/ReciPrime/releases/latest)
[![Build](https://github.com/zzong-mee/ReciPrime/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/zzong-mee/ReciPrime/actions/workflows/build.yml)
[![License: CC0-1.0](https://img.shields.io/badge/license-CC0--1.0-blue)](LICENSE)
[![GitHub Downloads](https://img.shields.io/github/downloads/zzong-mee/ReciPrime/total?label=downloads)](https://github.com/zzong-mee/ReciPrime/releases)

**English** · [한국어](README.ko.md)

[Download latest release](https://github.com/zzong-mee/ReciPrime/releases/latest) · [Changelog](CHANGELOG.md) · [Report an issue](https://github.com/zzong-mee/ReciPrime/issues)

</div>

## About

**ReciPrime** is a vanilla-friendly Fabric mod for Minecraft Java Edition **26.3** that introduces alternative crafting recipes and new ways to obtain resources.

Designed to expand crafting possibilities while preserving the balance and spirit of vanilla Minecraft, ReciPrime offers new approaches to familiar items without changing the core survival experience.

The name ReciPrime combines **Recipe** with the mathematical prime symbol (′), representing new possibilities derived from existing recipes.

## Development direction

ReciPrime v1.1.0 is currently in development.

- Alternative crafting recipes using vanilla Minecraft items.
- No custom items or dedicated creative inventory tabs.
- Preservation of vanilla gameplay and existing resource drops.
- New crafting recipes are currently being developed.

> **Compatibility notice:** Custom items from previous releases have been removed. Back up existing worlds before upgrading.

## Requirements

| Component | Version |
|---|---|
| Minecraft Java Edition | **26.3** |
| Fabric Loader | **0.19.5 or newer** |
| Fabric API | **0.166.2+26.3** (version used to build the mod) |
| Java | **25 or newer** |
| Installation | **Both server and client** |

## Installation

1. Install a compatible **Fabric Loader** for Minecraft 26.3.
2. Install **Fabric API**.
3. For the existing v1.0.0 release, download `sulfur_gunpowder-1.0.0.jar` from [GitHub Releases](https://github.com/zzong-mee/ReciPrime/releases/tag/v1.0.0).
4. Put the mod JAR and Fabric API in the `mods` directory **on both the client and server**.
5. Start Minecraft or the dedicated server with Fabric.

Download the regular mod JAR, **not** the `-sources.jar` source archive.

## Build from source

A Java 25 development environment is required.

```bash
# macOS / Linux
./gradlew build
```

```bat
REM Windows
gradlew.bat build
```

The compiled mod JAR is written to `build/libs/`.

## Releases and history

- **v1.0.0** is the first stable release, published under the former Sulfur Gunpowder name.
- **v1.1.0** is in development and introduces the ReciPrime identity.
- Previous releases and their changes are documented in [CHANGELOG.md](CHANGELOG.md).
- View downloadable versions on the [Releases page](https://github.com/zzong-mee/ReciPrime/releases).

## License

This project includes a [CC0 1.0 Universal license](LICENSE).

---
<div align="center">

Made for the Minecraft Fabric community.

</div>
