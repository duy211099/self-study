#pragma checksum "D:\ExploreCalifornia\Views\Blog\Post.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "5956c621ba0e5f9097e37b0911e0788cdf0e39f5"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Blog_Post), @"mvc.1.0.view", @"/Views/Blog/Post.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Blog/Post.cshtml", typeof(AspNetCore.Views_Blog_Post))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"5956c621ba0e5f9097e37b0911e0788cdf0e39f5", @"/Views/Blog/Post.cshtml")]
    public class Views_Blog_Post : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<ExploreCalifornia.Models.Post>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
#line 2 "D:\ExploreCalifornia\Views\Blog\Post.cshtml"
  
    Layout = "_Layout";

#line default
#line hidden
            BeginContext(70, 2, true);
            WriteLiteral("\r\n");
            EndContext();
            BeginContext(73, 32, false);
#line 6 "D:\ExploreCalifornia\Views\Blog\Post.cshtml"
Write(await Html.PartialAsync("_Post"));

#line default
#line hidden
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<ExploreCalifornia.Models.Post> Html { get; private set; }
    }
}
#pragma warning restore 1591
