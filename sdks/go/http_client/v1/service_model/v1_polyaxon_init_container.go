// Copyright 2018-2021 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by go-swagger; DO NOT EDIT.

package service_model

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"

	"github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
)

// V1PolyaxonInitContainer Polyaxon init specification
//
// swagger:model v1PolyaxonInitContainer
type V1PolyaxonInitContainer struct {

	// image
	Image string `json:"image,omitempty"`

	// image pull policy
	ImagePullPolicy string `json:"imagePullPolicy,omitempty"`

	// image tag
	ImageTag string `json:"imageTag,omitempty"`

	// resources
	Resources V1ResourceRequirements `json:"resources,omitempty"`
}

// Validate validates this v1 polyaxon init container
func (m *V1PolyaxonInitContainer) Validate(formats strfmt.Registry) error {
	return nil
}

// ContextValidate validates this v1 polyaxon init container based on context it is used
func (m *V1PolyaxonInitContainer) ContextValidate(ctx context.Context, formats strfmt.Registry) error {
	return nil
}

// MarshalBinary interface implementation
func (m *V1PolyaxonInitContainer) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *V1PolyaxonInitContainer) UnmarshalBinary(b []byte) error {
	var res V1PolyaxonInitContainer
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
