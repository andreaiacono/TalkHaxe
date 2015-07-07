#ifndef INCLUDED_haxe_Test
#define INCLUDED_haxe_Test

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS1(haxe,Test)
namespace haxe{


class HXCPP_CLASS_ATTRIBUTES  Test_obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef Test_obj OBJ_;
		Test_obj();
		Void __construct(::String jsonData);

	public:
		inline void *operator new( size_t inSize, bool inContainer=true,const char *inName="haxe.Test")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< Test_obj > __new(::String jsonData);
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Test_obj();

		HX_DO_RTTI_ALL;
		Dynamic __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		Dynamic __SetField(const ::String &inString,const Dynamic &inValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		::String __ToString() const { return HX_HCSTRING("Test","\x72","\xf4","\xd2","\x37"); }

		Dynamic root;
		static Void main( );
		static Dynamic main_dyn();

};

} // end namespace haxe

#endif /* INCLUDED_haxe_Test */ 
