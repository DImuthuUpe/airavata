/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef airavataErrors_TYPES_H
#define airavataErrors_TYPES_H

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>


namespace airavata { namespace api { namespace error {

struct AiravataErrorType {
  enum type {
    UNKNOWN = 0,
    PERMISSION_DENIED = 1,
    INTERNAL_ERROR = 2,
    AUTHENTICATION_FAILURE = 3,
    INVALID_AUTHORIZATION = 4,
    AUTHORIZATION_EXPIRED = 5,
    UNKNOWN_GATEWAY_ID = 6,
    UNSUPPORTED_OPERATION = 7
  };
};

extern const std::map<int, const char*> _AiravataErrorType_VALUES_TO_NAMES;


class ExperimentNotFoundException : public ::apache::thrift::TException {
 public:

  static const char* ascii_fingerprint; // = "EFB929595D312AC8F305D5A794CFEDA1";
  static const uint8_t binary_fingerprint[16]; // = {0xEF,0xB9,0x29,0x59,0x5D,0x31,0x2A,0xC8,0xF3,0x05,0xD5,0xA7,0x94,0xCF,0xED,0xA1};

  ExperimentNotFoundException() : message() {
  }

  virtual ~ExperimentNotFoundException() throw() {}

  std::string message;

  void __set_message(const std::string& val) {
    message = val;
  }

  bool operator == (const ExperimentNotFoundException & rhs) const
  {
    if (!(message == rhs.message))
      return false;
    return true;
  }
  bool operator != (const ExperimentNotFoundException &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const ExperimentNotFoundException & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

void swap(ExperimentNotFoundException &a, ExperimentNotFoundException &b);


class InvalidRequestException : public ::apache::thrift::TException {
 public:

  static const char* ascii_fingerprint; // = "EFB929595D312AC8F305D5A794CFEDA1";
  static const uint8_t binary_fingerprint[16]; // = {0xEF,0xB9,0x29,0x59,0x5D,0x31,0x2A,0xC8,0xF3,0x05,0xD5,0xA7,0x94,0xCF,0xED,0xA1};

  InvalidRequestException() : message() {
  }

  virtual ~InvalidRequestException() throw() {}

  std::string message;

  void __set_message(const std::string& val) {
    message = val;
  }

  bool operator == (const InvalidRequestException & rhs) const
  {
    if (!(message == rhs.message))
      return false;
    return true;
  }
  bool operator != (const InvalidRequestException &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const InvalidRequestException & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

void swap(InvalidRequestException &a, InvalidRequestException &b);


class TimedOutException : public ::apache::thrift::TException {
 public:

  static const char* ascii_fingerprint; // = "99914B932BD37A50B983C5E7C90AE93B";
  static const uint8_t binary_fingerprint[16]; // = {0x99,0x91,0x4B,0x93,0x2B,0xD3,0x7A,0x50,0xB9,0x83,0xC5,0xE7,0xC9,0x0A,0xE9,0x3B};

  TimedOutException() {
  }

  virtual ~TimedOutException() throw() {}


  bool operator == (const TimedOutException & /* rhs */) const
  {
    return true;
  }
  bool operator != (const TimedOutException &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const TimedOutException & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

void swap(TimedOutException &a, TimedOutException &b);


class AuthenticationException : public ::apache::thrift::TException {
 public:

  static const char* ascii_fingerprint; // = "EFB929595D312AC8F305D5A794CFEDA1";
  static const uint8_t binary_fingerprint[16]; // = {0xEF,0xB9,0x29,0x59,0x5D,0x31,0x2A,0xC8,0xF3,0x05,0xD5,0xA7,0x94,0xCF,0xED,0xA1};

  AuthenticationException() : message() {
  }

  virtual ~AuthenticationException() throw() {}

  std::string message;

  void __set_message(const std::string& val) {
    message = val;
  }

  bool operator == (const AuthenticationException & rhs) const
  {
    if (!(message == rhs.message))
      return false;
    return true;
  }
  bool operator != (const AuthenticationException &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AuthenticationException & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

void swap(AuthenticationException &a, AuthenticationException &b);


class AuthorizationException : public ::apache::thrift::TException {
 public:

  static const char* ascii_fingerprint; // = "EFB929595D312AC8F305D5A794CFEDA1";
  static const uint8_t binary_fingerprint[16]; // = {0xEF,0xB9,0x29,0x59,0x5D,0x31,0x2A,0xC8,0xF3,0x05,0xD5,0xA7,0x94,0xCF,0xED,0xA1};

  AuthorizationException() : message() {
  }

  virtual ~AuthorizationException() throw() {}

  std::string message;

  void __set_message(const std::string& val) {
    message = val;
  }

  bool operator == (const AuthorizationException & rhs) const
  {
    if (!(message == rhs.message))
      return false;
    return true;
  }
  bool operator != (const AuthorizationException &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AuthorizationException & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

void swap(AuthorizationException &a, AuthorizationException &b);

typedef struct _AiravataClientException__isset {
  _AiravataClientException__isset() : parameter(false) {}
  bool parameter;
} _AiravataClientException__isset;

class AiravataClientException : public ::apache::thrift::TException {
 public:

  static const char* ascii_fingerprint; // = "24652790C81ECE22B629CB60A19F1E93";
  static const uint8_t binary_fingerprint[16]; // = {0x24,0x65,0x27,0x90,0xC8,0x1E,0xCE,0x22,0xB6,0x29,0xCB,0x60,0xA1,0x9F,0x1E,0x93};

  AiravataClientException() : airavataErrorType((AiravataErrorType::type)0), parameter() {
  }

  virtual ~AiravataClientException() throw() {}

  AiravataErrorType::type airavataErrorType;
  std::string parameter;

  _AiravataClientException__isset __isset;

  void __set_airavataErrorType(const AiravataErrorType::type val) {
    airavataErrorType = val;
  }

  void __set_parameter(const std::string& val) {
    parameter = val;
    __isset.parameter = true;
  }

  bool operator == (const AiravataClientException & rhs) const
  {
    if (!(airavataErrorType == rhs.airavataErrorType))
      return false;
    if (__isset.parameter != rhs.__isset.parameter)
      return false;
    else if (__isset.parameter && !(parameter == rhs.parameter))
      return false;
    return true;
  }
  bool operator != (const AiravataClientException &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AiravataClientException & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

void swap(AiravataClientException &a, AiravataClientException &b);

typedef struct _AiravataSystemException__isset {
  _AiravataSystemException__isset() : message(false) {}
  bool message;
} _AiravataSystemException__isset;

class AiravataSystemException : public ::apache::thrift::TException {
 public:

  static const char* ascii_fingerprint; // = "24652790C81ECE22B629CB60A19F1E93";
  static const uint8_t binary_fingerprint[16]; // = {0x24,0x65,0x27,0x90,0xC8,0x1E,0xCE,0x22,0xB6,0x29,0xCB,0x60,0xA1,0x9F,0x1E,0x93};

  AiravataSystemException() : airavataErrorType((AiravataErrorType::type)0), message() {
  }

  virtual ~AiravataSystemException() throw() {}

  AiravataErrorType::type airavataErrorType;
  std::string message;

  _AiravataSystemException__isset __isset;

  void __set_airavataErrorType(const AiravataErrorType::type val) {
    airavataErrorType = val;
  }

  void __set_message(const std::string& val) {
    message = val;
    __isset.message = true;
  }

  bool operator == (const AiravataSystemException & rhs) const
  {
    if (!(airavataErrorType == rhs.airavataErrorType))
      return false;
    if (__isset.message != rhs.__isset.message)
      return false;
    else if (__isset.message && !(message == rhs.message))
      return false;
    return true;
  }
  bool operator != (const AiravataSystemException &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const AiravataSystemException & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

void swap(AiravataSystemException &a, AiravataSystemException &b);

}}} // namespace

#endif
