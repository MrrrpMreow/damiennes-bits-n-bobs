#!/bin/bash
echo Usage: jsonhandler.sh blockname \(optional blockpath ending in /\)

printf "{\n  \"variants\": {\n    \"\": { \"model\": \"bitsnbobs:block/$2$1\" }\n  }\n}" > ./src/main/resources/assets/bitsnbobs/blockstates/$1.json
printf "{\n  \"parent\": \"block/cube_all\",\n  \"textures\": {\n    \"all\": \"bitsnbobs:block/$2$1\"\n  }\n}" > ./src/main/resources/assets/bitsnbobs/models/block/$2$1.json
printf "{\n  \"parent\": \"bitsnbobs:block/$2$1\"\n}" > ./src/main/resources/assets/bitsnbobs/models/item/$1.json
