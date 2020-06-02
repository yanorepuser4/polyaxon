#!/usr/bin/python
#
# Copyright 2018-2020 Polyaxon, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from coredb.models.artifacts import ArtifactLineage

artifacts = ArtifactLineage.objects.prefetch_related("artifact").only(
    "is_input",
    "artifact__id",
    "artifact__name",
    "artifact__kind",
    "artifact__path",
    "artifact__summary",
)

project_runs_artifacts = (
    ArtifactLineage.objects.prefetch_related("artifact")
    .only("is_input", "artifact__id", "artifact__name", "artifact__kind",)
    .distinct("is_input", "artifact__name", "artifact__kind",)
)