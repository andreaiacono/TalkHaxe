#include <hxcpp.h>

#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_haxe_Test
#include <haxe/Test.h>
#endif
#ifndef INCLUDED_haxe_format_JsonParser
#include <haxe/format/JsonParser.h>
#endif
namespace haxe{

Void Test_obj::__construct(::String jsonData)
{
HX_STACK_FRAME("haxe.Test","new",0x7d86abac,"haxe.Test.new","haxe/Test.hx",11,0xf16fdf63)
HX_STACK_THIS(this)
HX_STACK_ARG(jsonData,"jsonData")
{
	HX_STACK_LINE(12)
	::haxe::format::JsonParser tmp = ::haxe::format::JsonParser_obj::__new(jsonData);		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(12)
	Dynamic tmp1 = tmp->parseRec();		HX_STACK_VAR(tmp1,"tmp1");
	HX_STACK_LINE(12)
	this->root = tmp1;
	HX_STACK_LINE(13)
	Dynamic tmp2 = this->root;		HX_STACK_VAR(tmp2,"tmp2");
	HX_STACK_LINE(13)
	::String tmp3 = tmp2->__Field(HX_HCSTRING("name","\x4b","\x72","\xff","\x48"), hx::paccDynamic );		HX_STACK_VAR(tmp3,"tmp3");
	HX_STACK_LINE(13)
	::String tmp4 = (HX_HCSTRING("name=","\x92","\x8f","\x84","\x96") + tmp3);		HX_STACK_VAR(tmp4,"tmp4");
	HX_STACK_LINE(13)
	Dynamic tmp5 = hx::SourceInfo(HX_HCSTRING("Test.hx","\x8c","\x21","\xfb","\x8a"),13,HX_HCSTRING("haxe.Test","\xba","\xa5","\x8c","\xf2"),HX_HCSTRING("new","\x60","\xd0","\x53","\x00"));		HX_STACK_VAR(tmp5,"tmp5");
	HX_STACK_LINE(13)
	::haxe::Log_obj::trace(tmp4,tmp5);
	HX_STACK_LINE(14)
	Dynamic tmp6 = this->root;		HX_STACK_VAR(tmp6,"tmp6");
	HX_STACK_LINE(14)
	Dynamic tmp7 = tmp6->__Field(HX_HCSTRING("children","\x3f","\x19","\x6a","\x70"), hx::paccDynamic )->__GetItem((int)0);		HX_STACK_VAR(tmp7,"tmp7");
	HX_STACK_LINE(14)
	::String tmp8 = ::Std_obj::string(tmp7);		HX_STACK_VAR(tmp8,"tmp8");
	HX_STACK_LINE(14)
	::String tmp9 = (HX_HCSTRING("children=","\x1e","\xfe","\x6b","\xec") + tmp8);		HX_STACK_VAR(tmp9,"tmp9");
	HX_STACK_LINE(14)
	Dynamic tmp10 = hx::SourceInfo(HX_HCSTRING("Test.hx","\x8c","\x21","\xfb","\x8a"),14,HX_HCSTRING("haxe.Test","\xba","\xa5","\x8c","\xf2"),HX_HCSTRING("new","\x60","\xd0","\x53","\x00"));		HX_STACK_VAR(tmp10,"tmp10");
	HX_STACK_LINE(14)
	::haxe::Log_obj::trace(tmp9,tmp10);
}
;
	return null();
}

//Test_obj::~Test_obj() { }

Dynamic Test_obj::__CreateEmpty() { return  new Test_obj; }
hx::ObjectPtr< Test_obj > Test_obj::__new(::String jsonData)
{  hx::ObjectPtr< Test_obj > _result_ = new Test_obj();
	_result_->__construct(jsonData);
	return _result_;}

Dynamic Test_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< Test_obj > _result_ = new Test_obj();
	_result_->__construct(inArgs[0]);
	return _result_;}

Void Test_obj::main( ){
{
		HX_STACK_FRAME("haxe.Test","main",0x57a33f6d,"haxe.Test.main","haxe/Test.hx",5,0xf16fdf63)
		HX_STACK_LINE(6)
		::haxe::Test tmp = ::haxe::Test_obj::__new(HX_HCSTRING("{ \"name\" : \"test\", [ {\"name\": \"child1\"}, { \"name\":\"child2\"}]};","\x85","\x16","\x4d","\xc5"));		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(6)
		::haxe::Test test = tmp;		HX_STACK_VAR(test,"test");
	}
return null();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(Test_obj,main,(void))


Test_obj::Test_obj()
{
}

void Test_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(Test);
	HX_MARK_MEMBER_NAME(root,"root");
	HX_MARK_END_CLASS();
}

void Test_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(root,"root");
}

Dynamic Test_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"root") ) { return root; }
	}
	return super::__Field(inName,inCallProp);
}

bool Test_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"main") ) { outValue = main_dyn(); return true;  }
	}
	return false;
}

Dynamic Test_obj::__SetField(const ::String &inName,const Dynamic &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"root") ) { root=inValue.Cast< Dynamic >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

bool Test_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	return false;
}

void Test_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("root","\x22","\xee","\xae","\x4b"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo sMemberStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(Test_obj,root),HX_HCSTRING("root","\x22","\xee","\xae","\x4b")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *sStaticStorageInfo = 0;
#endif

static ::String sMemberFields[] = {
	HX_HCSTRING("root","\x22","\xee","\xae","\x4b"),
	::String(null()) };

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Test_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Test_obj::__mClass,"__mClass");
};

#endif

hx::Class Test_obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("main","\x39","\x38","\x56","\x48"),
	::String(null()) };

void Test_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("haxe.Test","\xba","\xa5","\x8c","\xf2");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Test_obj::__GetStatic;
	__mClass->mSetStaticField = &Test_obj::__SetStatic;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Test_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = sStaticStorageInfo;
#endif
	hx::RegisterClass(__mClass->mName, __mClass);
}

} // end namespace haxe
