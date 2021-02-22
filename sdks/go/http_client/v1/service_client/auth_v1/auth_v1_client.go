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

package auth_v1

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"github.com/go-openapi/runtime"
	"github.com/go-openapi/strfmt"
)

// New creates a new auth v1 API client.
func New(transport runtime.ClientTransport, formats strfmt.Registry) ClientService {
	return &Client{transport: transport, formats: formats}
}

/*
Client for auth v1 API
*/
type Client struct {
	transport runtime.ClientTransport
	formats   strfmt.Registry
}

// ClientOption is the option for Client methods
type ClientOption func(*runtime.ClientOperation)

// ClientService is the interface for Client methods
type ClientService interface {
	ChangePassword(params *ChangePasswordParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*ChangePasswordOK, *ChangePasswordNoContent, error)

	Login(params *LoginParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*LoginOK, *LoginNoContent, error)

	ResetPassword(params *ResetPasswordParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*ResetPasswordOK, *ResetPasswordNoContent, error)

	ResetPasswordConfirm(params *ResetPasswordConfirmParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*ResetPasswordConfirmOK, *ResetPasswordConfirmNoContent, error)

	Signup(params *SignupParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*SignupOK, *SignupNoContent, error)

	SetTransport(transport runtime.ClientTransport)
}

/*
  ChangePassword changes password
*/
func (a *Client) ChangePassword(params *ChangePasswordParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*ChangePasswordOK, *ChangePasswordNoContent, error) {
	// TODO: Validate the params before sending
	if params == nil {
		params = NewChangePasswordParams()
	}
	op := &runtime.ClientOperation{
		ID:                 "ChangePassword",
		Method:             "POST",
		PathPattern:        "/api/v1/auth/change-password",
		ProducesMediaTypes: []string{"application/json"},
		ConsumesMediaTypes: []string{"application/json"},
		Schemes:            []string{"http", "https"},
		Params:             params,
		Reader:             &ChangePasswordReader{formats: a.formats},
		AuthInfo:           authInfo,
		Context:            params.Context,
		Client:             params.HTTPClient,
	}
	for _, opt := range opts {
		opt(op)
	}

	result, err := a.transport.Submit(op)
	if err != nil {
		return nil, nil, err
	}
	switch value := result.(type) {
	case *ChangePasswordOK:
		return value, nil, nil
	case *ChangePasswordNoContent:
		return nil, value, nil
	}
	// unexpected success response
	unexpectedSuccess := result.(*ChangePasswordDefault)
	return nil, nil, runtime.NewAPIError("unexpected success response: content available as default response in error", unexpectedSuccess, unexpectedSuccess.Code())
}

/*
  Login logins
*/
func (a *Client) Login(params *LoginParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*LoginOK, *LoginNoContent, error) {
	// TODO: Validate the params before sending
	if params == nil {
		params = NewLoginParams()
	}
	op := &runtime.ClientOperation{
		ID:                 "Login",
		Method:             "POST",
		PathPattern:        "/api/v1/auth/token",
		ProducesMediaTypes: []string{"application/json"},
		ConsumesMediaTypes: []string{"application/json"},
		Schemes:            []string{"http", "https"},
		Params:             params,
		Reader:             &LoginReader{formats: a.formats},
		AuthInfo:           authInfo,
		Context:            params.Context,
		Client:             params.HTTPClient,
	}
	for _, opt := range opts {
		opt(op)
	}

	result, err := a.transport.Submit(op)
	if err != nil {
		return nil, nil, err
	}
	switch value := result.(type) {
	case *LoginOK:
		return value, nil, nil
	case *LoginNoContent:
		return nil, value, nil
	}
	// unexpected success response
	unexpectedSuccess := result.(*LoginDefault)
	return nil, nil, runtime.NewAPIError("unexpected success response: content available as default response in error", unexpectedSuccess, unexpectedSuccess.Code())
}

/*
  ResetPassword resets password
*/
func (a *Client) ResetPassword(params *ResetPasswordParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*ResetPasswordOK, *ResetPasswordNoContent, error) {
	// TODO: Validate the params before sending
	if params == nil {
		params = NewResetPasswordParams()
	}
	op := &runtime.ClientOperation{
		ID:                 "ResetPassword",
		Method:             "POST",
		PathPattern:        "/api/v1/auth/reset-password",
		ProducesMediaTypes: []string{"application/json"},
		ConsumesMediaTypes: []string{"application/json"},
		Schemes:            []string{"http", "https"},
		Params:             params,
		Reader:             &ResetPasswordReader{formats: a.formats},
		AuthInfo:           authInfo,
		Context:            params.Context,
		Client:             params.HTTPClient,
	}
	for _, opt := range opts {
		opt(op)
	}

	result, err := a.transport.Submit(op)
	if err != nil {
		return nil, nil, err
	}
	switch value := result.(type) {
	case *ResetPasswordOK:
		return value, nil, nil
	case *ResetPasswordNoContent:
		return nil, value, nil
	}
	// unexpected success response
	unexpectedSuccess := result.(*ResetPasswordDefault)
	return nil, nil, runtime.NewAPIError("unexpected success response: content available as default response in error", unexpectedSuccess, unexpectedSuccess.Code())
}

/*
  ResetPasswordConfirm resets password confirm
*/
func (a *Client) ResetPasswordConfirm(params *ResetPasswordConfirmParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*ResetPasswordConfirmOK, *ResetPasswordConfirmNoContent, error) {
	// TODO: Validate the params before sending
	if params == nil {
		params = NewResetPasswordConfirmParams()
	}
	op := &runtime.ClientOperation{
		ID:                 "ResetPasswordConfirm",
		Method:             "POST",
		PathPattern:        "/api/v1/auth/reset-password-confirm",
		ProducesMediaTypes: []string{"application/json"},
		ConsumesMediaTypes: []string{"application/json"},
		Schemes:            []string{"http", "https"},
		Params:             params,
		Reader:             &ResetPasswordConfirmReader{formats: a.formats},
		AuthInfo:           authInfo,
		Context:            params.Context,
		Client:             params.HTTPClient,
	}
	for _, opt := range opts {
		opt(op)
	}

	result, err := a.transport.Submit(op)
	if err != nil {
		return nil, nil, err
	}
	switch value := result.(type) {
	case *ResetPasswordConfirmOK:
		return value, nil, nil
	case *ResetPasswordConfirmNoContent:
		return nil, value, nil
	}
	// unexpected success response
	unexpectedSuccess := result.(*ResetPasswordConfirmDefault)
	return nil, nil, runtime.NewAPIError("unexpected success response: content available as default response in error", unexpectedSuccess, unexpectedSuccess.Code())
}

/*
  Signup signups
*/
func (a *Client) Signup(params *SignupParams, authInfo runtime.ClientAuthInfoWriter, opts ...ClientOption) (*SignupOK, *SignupNoContent, error) {
	// TODO: Validate the params before sending
	if params == nil {
		params = NewSignupParams()
	}
	op := &runtime.ClientOperation{
		ID:                 "Signup",
		Method:             "POST",
		PathPattern:        "/api/v1/auth/signup",
		ProducesMediaTypes: []string{"application/json"},
		ConsumesMediaTypes: []string{"application/json"},
		Schemes:            []string{"http", "https"},
		Params:             params,
		Reader:             &SignupReader{formats: a.formats},
		AuthInfo:           authInfo,
		Context:            params.Context,
		Client:             params.HTTPClient,
	}
	for _, opt := range opts {
		opt(op)
	}

	result, err := a.transport.Submit(op)
	if err != nil {
		return nil, nil, err
	}
	switch value := result.(type) {
	case *SignupOK:
		return value, nil, nil
	case *SignupNoContent:
		return nil, value, nil
	}
	// unexpected success response
	unexpectedSuccess := result.(*SignupDefault)
	return nil, nil, runtime.NewAPIError("unexpected success response: content available as default response in error", unexpectedSuccess, unexpectedSuccess.Code())
}

// SetTransport changes the transport on the client
func (a *Client) SetTransport(transport runtime.ClientTransport) {
	a.transport = transport
}
