<div align="center">

<img src="docs/images/reciprime_logo.png" alt="ReciPrime logo" width="160">

# ReciPrime

**바닐라에서 프라임으로.**

[![최신 릴리스](https://img.shields.io/github/v/release/zzong-mee/ReciPrime?label=release)](https://github.com/zzong-mee/ReciPrime/releases/latest)
[![빌드](https://github.com/zzong-mee/ReciPrime/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/zzong-mee/ReciPrime/actions/workflows/build.yml)
[![라이선스: CC0-1.0](https://img.shields.io/badge/license-CC0--1.0-blue)](LICENSE)
[![총 다운로드](https://img.shields.io/github/downloads/zzong-mee/ReciPrime/total?label=downloads)](https://github.com/zzong-mee/ReciPrime/releases)

[English](README.md) · **한국어**

[최신 버전 다운로드](https://github.com/zzong-mee/ReciPrime/releases/latest) · [변경 내역](CHANGELOG.md) · [문제 제보](https://github.com/zzong-mee/ReciPrime/issues)

</div>

## 모드 소개

**ReciPrime**은 Minecraft Java Edition **26.3**용 바닐라 친화적 Fabric 모드로, 대체 조합법과 새로운 자원 획득 방법을 제공합니다.

바닐라 마인크래프트의 균형과 정체성을 유지하면서 제작의 가능성을 확장하고, 기존 생존 플레이의 흐름을 해치지 않으면서 익숙한 아이템을 얻는 새로운 방법을 제시합니다.

ReciPrime이라는 이름은 조합법을 뜻하는 **Recipe**와 수학의 프라임 기호(′)를 결합한 것으로, 기존 조합법에서 새로운 가능성을 유도한다는 의미를 담고 있습니다.

## 개발 방향

ReciPrime v1.1.0은 현재 개발 중입니다.

- 바닐라 마인크래프트 아이템을 활용한 대체 조합법
- 커스텀 아이템 및 전용 크리에이티브 탭 미사용
- 기존 바닐라 플레이와 자원 드롭 방식 유지
- 새로운 조합법 개발 진행 중

> **호환성 주의:** 이전 버전의 커스텀 아이템이 제거되었습니다. 업데이트하기 전에 기존 월드를 백업하세요.

## 설치 요구 사항

| 구성 요소 | 요구 버전 |
|---|---|
| Minecraft Java Edition | **26.3** |
| Fabric Loader | **0.19.5 이상** |
| Fabric API | **0.166.2+26.3** (모드 빌드 기준 버전) |
| Java | **25 이상** |
| 설치 위치 | **서버와 클라이언트 양쪽** |

## 설치 방법

1. Minecraft 26.3용 **Fabric Loader**를 설치합니다.
2. **Fabric API**를 설치합니다.
3. [GitHub Releases](https://github.com/zzong-mee/ReciPrime/releases/tag/v1.0.0)에서 `sulfur_gunpowder-1.0.0.jar`를 다운로드합니다.
4. 서버와 클라이언트 **양쪽**의 `mods` 폴더에 모드 JAR와 Fabric API를 넣습니다.
5. Fabric 환경에서 마인크래프트 또는 전용 서버를 실행합니다.

설치할 파일은 일반 모드 JAR입니다. 소스 코드가 담긴 `-sources.jar`는 설치하지 마세요.

## 소스 코드 빌드

개발 환경에 Java 25가 필요합니다.

```bash
# macOS / Linux
./gradlew build
```

```bat
REM Windows
gradlew.bat build
```

빌드 결과물은 `build/libs/` 폴더에서 확인할 수 있습니다.

## 버전 및 변경 내역

- **v1.0.0**은 Sulfur Gunpowder라는 이름으로 출시된 최초 정식 안정 버전입니다.
- **v1.1.0**에서는 ReciPrime으로 브랜드를 변경하며 개발을 진행하고 있습니다.
- 이전 버전의 개발 이력은 [CHANGELOG.md](CHANGELOG.md)에 정리되어 있습니다.
- 배포된 버전은 [Releases 페이지](https://github.com/zzong-mee/ReciPrime/releases)에서 확인할 수 있습니다.

## 라이선스

프로젝트에는 [CC0 1.0 Universal 라이선스](LICENSE)가 포함되어 있습니다.

---
<div align="center">

Minecraft Fabric 커뮤니티를 위한 모드

</div>
