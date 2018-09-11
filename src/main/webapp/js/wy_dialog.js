(function($){
	$.wydialog=function(option){
		var $dialog=$('<div class="w_dialog"></div>');
		var $head=$('<div class="tit">'+option.title+
			'<a href="javascript:void(0)">X</a>'+
		'</div>');
		
		var $content=$('<div class="content">'+
			'<iframe src="'+option.url+'"></iframe>'+
		'</div>');
		$dialog.append($head).append($content);
		var $cover=$("<div></div>");
		$cover.css({
			"width":"100%",
			"height":"100%",
			"position":"absolute",
			"top":0,
			"left":0,
			"background":"#000",
			"opacity":0.3,
			"z-index":7
			});
		$("body").append($dialog).append($cover);
		$head.children("a").click(function(){
			$dialog.remove();
			$cover.remove();
		});

	}
})(jQuery);